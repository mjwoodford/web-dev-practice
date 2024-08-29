//The way he recommends
//const sounds = ['applause', 'boo', 'gasp', 'tada', 'victory', 'wrong']

//The more dynamic way
const sound_list = document.querySelectorAll('audio')
const sounds = []

sound_list.forEach(sound => {
	sounds.push(sound.id)
})

//console.log(sound_list)
//console.log(sounds)
//end the dynamic way

sounds.forEach(sound => {
	const btn = document.createElement('button')
	btn.classList.add('btn')

	btn.innerHTML = sound

	btn.addEventListener('click', () => {
		stopSongs()

		document.getElementById(sound).play()
	})
	document.getElementById('buttons').appendChild(btn)
})

function stopSongs() {
	sounds.forEach(sound => {
		const song = document.getElementById(sound)

		song.pause()
		song.currentTime = 0;
	})
}