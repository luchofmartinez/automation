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

Given user logged in
And select <product>
And select "Cambiar el equipo de mi Linea"
And select current plan
And click in add to cart
And click in btnContinueCart
And check terms and conditions
And click in btnContinuePersonalData
When "Contrafactura" is enabled
And select "Contrafactura" option
And select <number_of_installments> installments
Then register order
