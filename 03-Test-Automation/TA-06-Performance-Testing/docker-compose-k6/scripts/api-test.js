// import necessary module
import http from "k6/http";

export default function () {

  // define URL
  const url = "http://host.docker.internal:8087/studentmanagement/api/v1/students/";

  // define payload
  const payload = JSON.stringify({
    firstName: "Michael",
    lastName: "Gu",
    contact: "arthur@hotmail.com",
    course: "CS"
  });

  // define headers
  const params = {
    headers: {
      "Content-Type": "application/json",
    },
  };

  // send a post request and save response as a variable
  const res = http.post(url, payload, params);

  // Log the request body
  console.log(res.body);

  // check that response is 200
  check(res, {
    "response code was 200": (res) => res.status == 200,
  });
}