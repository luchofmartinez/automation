Meta:
@application CWA
@flow Cater
@process Register order
@project ECommerce
@user Logged in
@FormaPago
@Contrafactura

Narrative:
As a user logged in
I want to register an order with Contrafactura in 6 installments
So you can see the order summary

Scenario: Register an order with Contrafactura in 6 installments

Given user logged
and select imported equipment
and no change of plan
and add to cart
and Go to personal data
and Go to payment methods
When contrafactura is enabled
Then select contrafactura option
and select 6 installments
and register order
