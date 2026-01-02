
		const url = 'http://localhost:8088/studentmanagement/api/v1/students/';             
		const niceThings = document.getElementById('nice-thing');
		
		// perform GET request when select value changes
		niceThings.addEventListener('change', async () => {
			// object containing select value
			const selection = {
				niceThing: niceThings.value
			};
              
			console.log ("--> selected Student Number: " + niceThings.value);
			
			// GET request to server
			const response = await fetch(url.concat(niceThings.value), 
			{
			  method: 'get',
			  mode: 'cors'
			}
			);

            console.log ("--> response code: "  + response.status);             
			
			// if fetch is successful
			if (response.ok) {
			  const result = await response.json();			   
			  console.log ("--> response json firstname: " + result.firstName)
			  console.log ("--> response json lastname: " + result.lastName) 
			  
			  
              const myJSON = JSON.stringify(result); 
              console.log ("--> response json value: " + myJSON)
			  
			  // display query result
			  const newPara = document.createElement('p');
              const text = document.createTextNode(myJSON);
              newPara.appendChild(text);

			  // use getElementById to access the div element
              const div = document.getElementById('target');
              div.appendChild(newPara);
			  //div.replaceChild(newPara);
			  
			} else {
			  // if there's a problem fetching the data, display an error
			  alert('Got an error ................');
			}
			
		  } //end of addListener
		);