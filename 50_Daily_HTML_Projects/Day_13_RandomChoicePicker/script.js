const tagsElement = document.getElementById('tags')
const textArea = document.getElementById('textarea')

textArea.focus()

textArea.addEventListener('keyup', (e) => {
	createTags(e.target.value)

	if(e.key === 'Enter') {
		setTimeout(() => {
			e.target.value = ''
		}, 50)

		randomSelect()

	}
})

function createTags(input) {
	const tags = input.split(',').filter(tag => tag.trim() != '').map(tag => tag.trim())
	//console.log(tags)
	tagsElement.innerHTML = ''

	tags.forEach(tag => {
		const tagElement = document.createElement('span')
		tagElement.classList.add('tag')
		tagElement.innerText = tag
		tagsElement.appendChild(tagElement)
	})
}

function randomSelect() {
	//console.log('123')
	const times = 25
	const interval = setInterval(() => {
		const randomTag = pickRandomTag()

		highlightTag(randomTag)

		setTimeout(() => {
			unhighlightTag(randomTag)
		}, 100)
	}, 100);
	setTimeout( () => {
		clearInterval(interval)

		setTimeout(() => {
			const randomTag = pickRandomTag()
			highlightTag(randomTag)
		}, 100)
	}, times * 100)
}

function pickRandomTag() {
	const tags = document.querySelectorAll('.tag')
	return tags[Math.floor(Math.random() * tags.length)]
}

function highlightTag(specificTag) {
	specificTag.classList.add('highlight')
}

function unhighlightTag(specificTag) {
	specificTag.classList.remove('highlight')
}