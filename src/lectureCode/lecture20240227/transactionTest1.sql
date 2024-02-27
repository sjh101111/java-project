--AUTO COMMIT과 TRANSACTION 연습
--한 세션에선 커밋하지 않고 트랜잭션 진행중인 쿼리를 다른 세션에서 조회하면
--COMMIT할때까지 조회할 수 없으며, 테이블을 DROP하려해도 TRANSACTION 진행 중이라
--무한 로딩에 빠진다.

CREATE TABLE accounts (
                          name VARCHAR(100) NOT NULL,
                          balance INT NOT NULL
);

BEGIN;
--postgreSQL은 begin생략가능
INSERT INTO accounts(name, balance) VALUES('A', 10000);
INSERT INTO accounts(name, balance) VALUES('b', 10000);
SELECT * FROM ACCOUNTS;


SELECT * FROM accounts;
COMMIT;
