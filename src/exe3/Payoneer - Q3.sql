
/* --------1-------- */
SELECT playrid, MAX(score)
FROM (SELECT *
FROM Player_tbl
INNER JOIN Game_tbl ON Player_tbl.PlayrId=Game_tbl.PlayrId)
GROUP BY playrid;

/* --------2-------- */
SELECT Player_tbl.playrname
from Player_tbl
WHERE playrid not in (SELECT Player_tbl.PlayrId
FROM Player_tbl
INNER JOIN Game_tbl ON Player_tbl.PlayrId=Game_tbl.PlayrId);

/* --------3-------- */
SELECT playrname, playrid
FROM (SELECT *
FROM (SELECT *
FROM Player_tbl
INNER JOIN Game_tbl ON Player_tbl.PlayrId=Game_tbl.PlayrId))
GROUP BY playrid
HAVING sum(score) > 100;

