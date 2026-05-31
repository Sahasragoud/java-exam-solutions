-- List the top 5 cities with the highest number of distinct user registrations. 

use cognizant;

select u.city, count(r.user_id) as counting
from users u
inner join registrations r 
on u.user_id = r.user_id
group by u.city
order by counting DESC
limit 5;

