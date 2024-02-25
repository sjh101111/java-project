SELECT * FROM students;
select replace (address, '도', '레') from students;

SELECT address, COUNT(*)
FROM students
-- WHERE age >= 29
GROUP BY address
-- HAVING COUNT(*) >= 2
-- ORDER BY COUNT(*) DESC;
;

DELETE
FROM students
WHERE age between 30 and 33;

rollback


