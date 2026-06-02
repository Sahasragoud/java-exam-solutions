-- 16. Unregistered Active Users 
-- Find users who created an account in the last 30 days but haven’t registered for any events. 

use cognizant;

select * from users;

select u
from users u
left join registrations r
on r.user_id = u.user_id
where r.user_id is null and u.registration_date >= curdate() - interval 30 day;
