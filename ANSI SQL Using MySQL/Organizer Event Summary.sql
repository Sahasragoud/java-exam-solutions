-- Organizer Event Summary 
-- For each event organizer, show the number of events created and their current status 
-- (upcoming, completed, cancelled). 

select u.full_name, count(e.event_id) as No_of_events
from events e
inner join users u
on e.organizer_id = u.user_id
where e.status = 'upcoming'
group by u.user_id;