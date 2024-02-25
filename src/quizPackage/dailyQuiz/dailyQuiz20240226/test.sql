--20240226 데일리퀴즈 풀이
--https://school.programmers.co.kr/learn/courses/30/lessons/131533?language=mysql
create table PRODUCT (
                         PRODUCT_ID INTEGER NOT NULL,
                         PRODUCT_CODE VARCHAR(8) NOT NULL,
                         PRICE INTEGER NOT NULL
);

CREATE TABLE OFFLINE_SALE (
                              OFFLINE_SALE_ID INTEGER NOT NULL,
                              PRODUCT_ID INTEGER NOT NULL,
                              SALES_AMOUNT INTEGER NOT NULL,
                              SALES_DATE DATE NOT NULL
);

INSERT INTO PRODUCT (PRODUCT_ID, PRODUCT_CODE, PRICE)
VALUES (1,	'A1000011',	15000),
       (2,	'A1000045',	8000),
       (3,	'C3000002',	42000);

INSERT INTO OFFLINE_SALE (
    OFFLINE_SALE_ID,	PRODUCT_ID,	SALES_AMOUNT,	SALES_DATE)
VALUES
    (1,	1,	2,	'2022-02-21'),
    (2,	1,	2,	'2022-03-02'),
    (3,	3,	3,	'2022-05-01'),
    (4,	2,	1,	'2022-05-24'),
    (5,	1,	2,	'2022-07-14'),
    (6,	2,	1,	'2022-09-22');

SELECT * FROM PRODUCT;
SELECT * FROM OFFLINE_SALE;

SELECT * FROM PRODUCT A
                  INNER JOIN OFFLINE_SALE B
                             ON A.PRODUCT_ID = B.PRODUCT_ID;

SELECT A.PRODUCT_CODE, SUM( A.PRICE * COALESCE(B.SALES_AMOUNT, 0)) AS SALES
FROM PRODUCT A
         JOIN OFFLINE_SALE B
              ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_CODE
ORDER BY SALES DESC,
         A.PRODUCT_CODE ASC
;

--UNION 복습
SELECT name, age From students WHERE age < 30
UNION
SELECT name, age FROM students WHERE age < 32;

--UNION ALL 복습
SELECT name, age FROM students WHERE age < 30
UNION ALL
SELECT name, age FROM students WHERE age < 32;

--서브쿼리
--SELECT 절에서 사용하는 서브 쿼리
SELECT
    name,
    age,
    (SELECT AVG(age) FROM students) AS avg_Age
FROM students
WHERE age < 30;

--FROM 절에서 사용하는 서브 쿼리
SELECT *
FROM
    (
        SELECT name, class_name
        FROM classes
        WHERE class_name IN ('데이터베이스', '알고리즘')
    );

--WHERE 절에서 사용하는 서브 쿼리
SELECT name, age, address
FROM students
WHERE name IN (
    SELECT name FROM classes WHERE class_name IN ('데이터베이스','알고리즘')
    );

--Data Definition Language - DEFAULT
CREATE TABLE profile (
    id VARCHAR (255) NOT NULL,
    create_date DATE DEFAULT now()
);

INSERT INTO profile (id) values (45);

select * from profile;

--PK와 FK는 다를 수 있으며 REFERENCES로 참조시켜 가능하게 할 수 있다.
--연장선으로 서로 다른 두 테이블의 PK는 같을 수 있다.(다른 필드의 FK를 REFERENCES로 참조시키고
--같은 값의 필드를 PK로 지정한다.
CREATE TABLE customer (
    id INT PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    address VARCHAR(200),
    contact VARCHAR(100)
);

CREATE TABLE orders (
    id INT PRIMARY KEY ,
    customer_id INT,
    date TIMESTAMP DEFAULT now(),
    payment VARCHAR(50),
    amount INT,
    delivery_amount INT,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

--ALTER
-- --새로운 열 추가
ALTER TABLE students ADD grade varchar(20);

--기존 열 이름 변경
ALTER TABLE students RENAME COLUMN grade TO great;

--기조 열 데이터 타입 변경
ALTER TABLE students ALTER COLUMN address TYPE varchar(100);

--열 삭제
ALTER TABLE students DROP COLUMN great;

SELECT * FROM students;


