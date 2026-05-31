-- Low Feedback Alerts 
-- List all users who gave feedback with a rating less than 3, along with their comments and 
-- associated event names. 

use cognizant;

select * from feedback;

select u.full_name, e.title, f.comments
from feedback f 
inner join users u 
on u.user_id = f.user_id
inner join events e 
on e.event_id = f.event_id
where f.rating <= 3;