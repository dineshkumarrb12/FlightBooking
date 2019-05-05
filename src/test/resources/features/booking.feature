Feature: Make a booking in business class

Scenario: Book a flight for business class in United Airlines
Given Flight booking application is launched
When I login with user as dineshkumartest and password as dineshtest
And selecting one-way journey
And passengers as 3
And itinerary as London to Portland
And date as March-12 to April-27
And flight preference as Business class in United Airlines
Then flight should be booked

Scenario: Book a flight for economy class in Indian Airlines
Given Flight booking application is launched
When I login with user as dineshkumartest and password as dineshtest
And selecting one-way journey
And passengers as 3
And itinerary as Chennai to Delhi
And date as June-15 to July-27
And flight preference as economy class in Indian airlines
Then flight should be booked

Scenario: Verify no flight available for holidays
Given Flight booking application is launched
When I login with user as dineshkumartest and password as dineshtest
And selecting one-way journey
And passengers as 3
And itinerary as Chennai to Delhi
And date as August-15 to July-27
And flight preference as economy class in Indian airlines
Then no flight should be displayed