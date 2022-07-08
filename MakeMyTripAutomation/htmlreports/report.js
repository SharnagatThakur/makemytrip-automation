$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Feature_OneWayTrip.feature");
formatter.feature({
  "line": 1,
  "name": "One Way Trip Search Functionality",
  "description": "",
  "id": "one-way-trip-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to search for flights for one way trip",
  "description": "",
  "id": "one-way-trip-search-functionality;user-should-be-able-to-search-for-flights-for-one-way-trip",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to MakeMyTrip URL",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User should be able to remove any pop ups on the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User should be able provide From City input field",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should be able provide To City input field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be able to provide departure date",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be landed to search page with flight details",
  "keyword": "Then "
});
formatter.match({
  "location": "SD_OneWayTrip.user_navigates_to_MakeMyTrip_URL()"
});
formatter.result({
  "duration": 13533776589,
  "status": "passed"
});
formatter.match({
  "location": "SD_OneWayTrip.user_should_be_able_to_remove_any_pop_ups_on_the_home_page()"
});
formatter.result({
  "duration": 530781749,
  "status": "passed"
});
formatter.match({
  "location": "SD_OneWayTrip.user_should_be_able_provide_From_City_input_field()"
});
formatter.result({
  "duration": 6445654511,
  "status": "passed"
});
formatter.match({
  "location": "SD_OneWayTrip.user_should_be_able_provide_To_City_input_field()"
});
formatter.result({
  "duration": 4957358796,
  "status": "passed"
});
formatter.match({
  "location": "SD_OneWayTrip.user_should_be_able_to_provide_departure_date()"
});
formatter.result({
  "duration": 1059300055,
  "status": "passed"
});
formatter.match({
  "location": "SD_OneWayTrip.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 9369434849,
  "status": "passed"
});
formatter.match({
  "location": "SD_OneWayTrip.user_should_be_landed_to_search_page_with_flight_details()"
});
formatter.result({
  "duration": 3909762811,
  "status": "passed"
});
});