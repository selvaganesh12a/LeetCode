# Write your MySQL query statement below
SELECT firstName, lastName, city, state 
FROM person p 
LEFT JOIN address a 
ON p.personId = a.personId;