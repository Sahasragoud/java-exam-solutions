-- Event Session Time Conflict 
-- Identify overlapping sessions within the same event (i.e., session start and end times that 
-- conflict). 

select * from events;

SELECT
    s1.event_id,
    s1.session_id AS session1,
    s1.title AS session1_title,
    s2.session_id AS session2,
    s2.title AS session2_title
FROM sessions s1
JOIN sessions s2
    ON s1.event_id = s2.event_id
   AND s1.session_id < s2.session_id
   AND s1.start_time < s2.end_time
   AND s1.end_time > s2.start_time;
