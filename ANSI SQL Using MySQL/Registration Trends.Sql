-- 23. Registration Trends 
-- Show a month-wise registration count trend over the past 12 months. 

USE cognizant;

select 
	year(registration_date) as year,
	month(registration_date) as month,
	count(*) registration_count
from registrations 
where registration_date >= date_sub(curdate(), interval 12 month)
group by year, month
order by year, month;
