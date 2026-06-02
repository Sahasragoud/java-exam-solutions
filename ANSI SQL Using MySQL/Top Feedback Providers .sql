-- 21. Top Feedback Providers 
-- List top 5 users who have submitted the most feedback entries. 

select 
	f.user_id, 
    u.full_name,
    count(*) as feedback_count 
from feedback f
join users u
on u.user_id = f.user_id
group by f.user_id 
order by feedback_count desc
limit 5;
