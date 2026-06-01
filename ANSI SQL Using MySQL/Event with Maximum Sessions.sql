-- Event with Maximum Sessions 
-- List the event(s) with the highest number of sessions.

select * from sessions;

select event_id, count(session_id)
from sessions 
group by event_id
having count(session_id) = (
	select max(session_count)
    from (
		select count(session_id) as session_count from sessions group by event_id
        ) t
);