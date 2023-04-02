# Insurence-Rest-Api

Implement RESTful APIs for the following actions:
a. Clients:
i. GET /api/clients: Fetch all clients.
ii. GET /api/clients/{id}: Fetch a specific client by ID.
iii. POST /api/clients: Create a new client.
iv. PUT /api/clients/{id}: Update a client's information.
v. DELETE /api/clients/{id}: Delete a client.


b. Insurance Policies:
i. GET /api/policies: Fetch all insurance policies.
ii. GET /api/policies/{id}: Fetch a specific insurance policy by ID.
iii. POST /api/policies: Create a new insurance policy.
iv. PUT /api/policies/{id}: Update an insurance policy.
v. DELETE /api/policies/{id}: Delete an insurance policy.

c. Claims:
i. ii. iii. iv. v. 4. Use Spring
GET /api/claims: Fetch all claims.
GET /api/claims/{id}: Fetch a specific claim by ID. POST /api/claims: Create a new claim.
PUT /api/claims/{id}: Update a claim's information. DELETE /api/claims/{id}: Delete a claim.

src contain four folder first is 
Entity Package

contain all colum name client policy and claim

a)Customer Entity   a client with properties such as name, date of birth, address,
and contact information.
b)Insurence policy Entity  an insurance policy contain properties like policy
number, type, coverage amount, premium, start date, and end date. Each policy

c)Claim Entity:  an insurance claim are contain properties like claim number,
description, 


2 package is DAO

in this package are define and implement all the mathode like create update delete show() are all implement  are DAO packager 

3)Service layer service layes are manage to all the add 

4)Controller :controller are the provide all the mathode are get put post delete 

