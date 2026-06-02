-- 18. Resource Availability Check 
-- List all events that do not have any resources uploaded. 

select e.title
from resources r
left join events e
on r.event_id = e.event_id
where r.event_id is null;
