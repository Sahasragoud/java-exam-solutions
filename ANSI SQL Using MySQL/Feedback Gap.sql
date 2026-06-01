-- Feedback Gap 
-- Identify events that had registrations but received no feedback at all. 

use cognizant;

select e.title
from events e
left join feedback f
on e.event_id = f.event_id
left join registrations r 
on e.event_id = r.event_id
group by e.event_id
having count(r.registration_id) > 0 and count(f.feedback_id) = 0;

