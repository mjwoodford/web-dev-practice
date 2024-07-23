const loadText = document.querySelector('.loading-text')
const bg = document.querySelector('.bg')

let load = 0

let int = setInterval(blurring, 30)

function blurring() {
	load++
	if(load > 99) {
		clearInterval(int)
	}

	loadText.innerText = `${load}%`
	loadText.style.opacity = scaleNumber(load, 0, 100, 1, 0)
	bg.style.filter = `blur(${scaleNumber(load, 0, 100, 50, 0)}px)`

}

const scaleNumber = (number, min_input, max_input, min_output, max_output) => {
	return ((number - min_input) * (max_output - min_output)) / (max_input - min_input) + min_output;
}
// fun stack overflow link included in demo, responsible for the scale funct