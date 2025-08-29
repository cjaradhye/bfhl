# BFHL Spring Boot REST API

A REST API built with Spring Boot for Bajaj Finserv Hackathon Lab (BFHL).

## Features
- Accepts a POST request with an array of mixed values (numbers, alphabets, special characters)
- Returns:
	- Status (`is_success`)
	- User ID (format: `full_name_ddmmyyyy`)
	- Email ID
	- College Roll Number
	- Array of even numbers
	- Array of odd numbers
	- Array of alphabets (converted to uppercase)
	- Array of special characters
	- Sum of numbers
	- Concatenation of all alphabetical characters in reverse order with alternating caps


## Deployed API
Live URL: [https://bfhl-bn77.onrender.com/bfhl](https://bfhl-bn77.onrender.com/bfhl)

## Tech Stack
- Java 17
- Spring Boot
- Docker (for deployment)
- Hosted on Render

## API Usage
### Endpoint
`POST /bfhl`

### Request Body
```
{
	"data": ["1", "2", "a", "b", "@", "#"]
}
```

### Example cURL
```
curl -X POST https://<your-app>.onrender.com/bfhl \
	-H "Content-Type: application/json" \
	-d '{"data": ["1", "2", "a", "b", "@", "#"]}'
```

### Response
```
{
	"is_success": true,
	"user_id": "aradhye swarup_29082025",
	"email": "aradhye.swarup2022@vitstudent.ac.in",
	"college_roll_number": "22BCE2906",
	"even_numbers": [2],
	"odd_numbers": [1],
	"alphabets": ["A", "B"],
	"special_characters": ["@", "#"],
	"sum": 3,
	"reversed_alphabets": "Ba"
}
```

## How to Run Locally
1. Clone the repo:
	 ```sh
	 git clone https://github.com/cjaradhye/bfhl.git
	 cd bfhl
	 ```
2. Build the project:
	 ```sh
	 mvn clean install
	 ```
3. Run the app:
	 ```sh
	 mvn spring-boot:run
	 ```
4. The API will be available at `http://localhost:8080/bfhl`

## Docker
To build and run with Docker:
```sh
docker build -t bfhl-app .
docker run -p 8080:8080 bfhl-app
```

## Deployment (Render)
1. Push your code to GitHub
2. Create a new Web Service on [Render](https://render.com)
3. Select "Docker" as the environment
4. Set port to 8080
5. Deploy and use the public URL for API requests

## Author
Aradhye Swarup
aradhye.swarup2022@vitstudent.ac.in
22BCE2906

---
For any issues, open an issue on GitHub.
# bfhl
