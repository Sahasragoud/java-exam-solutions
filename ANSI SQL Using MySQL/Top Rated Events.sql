-- Top Rated Events 
-- Identify events with the highest average rating, considering only those that have received at 
-- least 10 feedback submissions. 
use cognizant;


select e.event_id, e.title, avg(f.rating) as avg_ratings
from events e
inner join Feedback f 
on f.event_id = e.event_id
group by e.event_id
having count(f.feedback_id) >= 10
ORDER BY avg_ratings DESC;