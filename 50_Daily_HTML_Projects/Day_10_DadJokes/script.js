const jokeElement = document.getElementById('joke')
const jokeButton = document.getElementById('jokeButton')
const initialButton = document.getElementById('initialButton')

jokeButton.addEventListener('click', generateJoke)
initialButton.addEventListener('click', generateFirstJoke)

function generateFirstJoke() {
	generateJoke()
	jokeButton.classList.remove('noshow')
	jokeButton.classList.add('btn')
	initialButton.remove('btn')
	initialButton.classList.add('noshow')
}



// you have to label your function async if you use await in fetch commands
async function generateJoke() {
	const jokeConfig = {
		headers: {
			'Accept': 'application/json'
		}
	}

	const jokeResponse = await fetch('https://icanhazdadjoke.com/', jokeConfig)

	const data = await jokeResponse.json()
	jokeElement.innerHTML = data.joke
	
	// .Then method for HTTPS
	/*
	fetch('https://icanhazdadjoke.com/', jokeConfig)
	.then((jokeResponse) => jokeResponse.json())
	.then((data) => {jokeElement.innerHTML = data.joke})
	*/
}