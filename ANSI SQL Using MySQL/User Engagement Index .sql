-- User Engagement Index 
-- For each user, calculate how many events they attended and how many feedbacks they 
-- submitted.


select 
	u.user_id, 
	u.full_name,
    count(distinct r.event_id) as events_attended,
    count(distinct f.feedback_id) as feedback_submitted
from users u
join registrations r
on r.user_id = u.user_id
join feedback f
on f.user_id = u.user_id
group by r.user_id, u.full_name;
 
