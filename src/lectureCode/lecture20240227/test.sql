SELECT * FROM students;
--없어진 기록 찾기
CREATE TABLE ANIMAL_INS (
            ANIMAL_ID	VARCHAR(20)	NOT NULL,
            ANIMAL_TYPE	VARCHAR(20)	NOT NULL,
            DATETIME	 TIMESTAMP	NOT NULL,
            INTAKE_CONDITION	VARCHAR(20)	NOT NULL,
            NAME	VARCHAR(20)	,
            SEX_UPON_INTAKE	VARCHAR(20)	NOT NULL
);

CREATE TABLE ANIMAL_OUTS (
     ANIMAL_ID	VARCHAR(20)	NOT NULL,
         ANIMAL_TYPE	VARCHAR(20)	NOT NULL,
         DATETIME	 TIMESTAMP	NOT NULL,
         NAME	VARCHAR(20),
         SEX_UPON_OUTCOME	VARCHAR(20)	NOT NULL
);

INSERT INTO ANIMAL_INS (ANIMAL_ID,	ANIMAL_TYPE	,DATETIME,	INTAKE_CONDITION,	NAME,	SEX_UPON_INTAKE)
VALUES
    ('A352713',	'Cat',	'2017-04-13 16:29:00',	'Normal',	'Gia', 'Spayed Female'),
    ('A350375',	'Cat',	'2017-03-06 15:01:00',	'Normal',	'Meo',	'Neutered Male');

INSERT INTO ANIMAL_OUTS (ANIMAL_ID,	ANIMAL_TYPE,	DATETIME,	NAME,	SEX_UPON_OUTCOME)
VALUES
('A349733',	'Dog'	,'2017-09-27 19:09:00',	'Allie',	'Spayed Female'),
('A352713',	'Cat'	,'2017-04-25 12:25:0'	,'Gia',	'Spayed Female'),
('A349990',	'Cat'	,'2018-02-02 14:18:00'	,'Spice',	'Spayed Female');

select * from ANIMAL_OUTS;

SELECT A.ANIMAL_ID, A.NAME FROM ANIMAL_OUTS A
LEFT OUTER JOIN ANIMAL_INS  B
ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.ANIMAL_ID IS NULL
ORDER BY A.ANIMAL_ID;

--cascade, restrict
drop table customer;
drop table orders;

CREATE TABLE customer (
                          id INT PRIMARY KEY,
                          name VARCHAR(10) NOT NULL,
                          address VARCHAR(200),
                          contact VARCHAR(100)
);

CREATE TABLE orders (
                        id INT PRIMARY KEY,
                        customer_id INT,
                        date TIMESTAMP DEFAULT now(),
                        payment VARCHAR(50),
                        amount INT,
                        delivery_amount INT,
                        FOREIGN KEY (customer_id) REFERENCES customer(id) ON DELETE SET NULL
);

INSERT INTO customer VALUES
                         (1, '동해물', '서울', '010-1234-5678'),
                         (2, '백두산', '부산', '010-8765-4321');

INSERT INTO orders VALUES
                       (1, 1, '2023-11-12', '신용카드', 10000, 2500),
                       (2, 1, '2023-11-13', '신용카드', 20000, 2500),
                       (3, 2, '2023-11-12', '계좌이체', 30000, 3000);

DELETE FROM customer WHERE ID=1;

SELECT * FROM customer;
SELECT * FROM orders;

CREATE TABLE LENGTH_TEST (
    id int,
    leng varchar(5)
);

INSERT INTO LENGTH_TEST VALUES (1, '12345678');
ALTER TABLE LENGTH_TEST ALTER COLUMN id TYPE VARCHAR(100);

alter table students
    add grade varchar(20);

alter table students rename column grade to great;
select great from students;
alter table students
    alter column address type varchar(100);

alter table students drop column great;

TRUNCATE students;

SELECT * FROM students;

--idx_테이블명_컬럼명
CREATE INDEX idx_students_name ON students (name);








