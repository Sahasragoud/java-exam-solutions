-- Sessions per Upcoming Event 
-- Display all upcoming events with the count of sessions scheduled for them. 

select e.title, count(s.session_id) as Sessions_per_Upcoming_Event
from events e
inner join sessions s
on e.event_id = s.event_id
where status = 'upcoming'
group by s.event_id;