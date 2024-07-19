const progress = document.getElementById('progress')
const prev = document.getElementById('prev')
const next = document.getElementById('next')
const circles = document.querySelectorAll('.circle')

let currentActiveStep = 1

next.addEventListener('click', () => {
	currentActiveStep++
	
	if(currentActiveStep > circles.length) {
		currentActiveStep = circles.length
	}

	//console.log(currentActiveStep)
	update()
})

prev.addEventListener('click', () => {
	currentActiveStep--
	
	if(currentActiveStep < 1) {
		currentActiveStep = 1
	}

	//console.log(currentActiveStep)
	update()
})

function update() {
	circles.forEach((circle, index) => {
		if(index < currentActiveStep) {
			circle.classList.add('active')
		} else {
			circle.classList.remove('active')
		}
	})

	const actives = document.querySelectorAll('.active')

	//console.log(((actives.length-1) / (circles.length-1)) * 100 +'%')
	progress.style.width = ((actives.length-1) / (circles.length-1)) * 100 +'%'

	if(currentActiveStep == 1) {
		prev.disabled = true
	} else if(currentActiveStep == circles.length) {
		next.disabled = true
	} else {
		prev.disabled = false
		next.disabled = false
	}
}