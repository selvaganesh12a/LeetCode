# Write your MySQL query statement below
SELECT x,y,z,IF(x+y > z AND x+z > y AND y+z > x = 1,'Yes','No') AS triangle 
FROM triangle;
