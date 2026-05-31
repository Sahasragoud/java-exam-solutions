-- 3. Inactive Users 
-- Retrieve users who have not registered for any events in the last 90 days. 

use cognizant;

select full_name  from users where datediff( now(), registration_date) > 90 ;