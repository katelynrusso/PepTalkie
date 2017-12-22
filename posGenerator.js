//selects a random adjective
function getAdj ()
{
	var adjectives = ['a kindred', 'a beautiful', 'a dazzling', 'an elegant', 'a fancy', 'a glamorous', 'a gorgeous', 
		'a handsome', 'a magnificent', 'a muscular', 'a lionhearted', 'a delightful', 'a wonderful', 'an amazing', 'a stupendous', 
		'a powerful', 'an ambitious', 'a faithful', 'a happy', 'a victorious', 'a zealous', 'a zesty', 'a lively', 'a witty', 
		'a spectacular', 'a melodic', 'a modern', 'a delicious', 'a sweet', 'a cuddly', 'a smart', 'a sassy', 'a strong', 
		'a limitless', 'an important', 'an impressive'];
	var randomNumber = Math.floor(Math.random()*(adjectives.length));
	return adjectives[randomNumber];
}

//selects a random noun
function getNoun ()
{
	var nouns = ['ace-in-the-hole', 'benefactor', 'catalyst', 'champion', 'connoisseur', 'devotee', 'dreamboat', 'enchantress', 
		'angel', 'artisan', 'beauty', 'brain', 'dude', 'comrade', 'genius', 'dear', 'doe', 'delight', 'doll', 'dawg', 'princess', 
		'fashionista', 'garden', 'gem', 'tamale', 'goddess', 'guardian', 'helper', 'hero', 'hotshot', 'go-getter', 'jester', 
		'spirit', 'kingpin', 'cupcake', 'legend', "lady's man", 'lionheart', 'masterpiece', 'tapestry', 'being', 'animal'];
	var randomNumber = Math.floor(Math.random()*(nouns.length));
	return nouns[randomNumber];
}

var compliment = "You are " + getAdj() + " " + getNoun();

/*
var button = document.createElement("button");
button.innerHTML = "Do Something";

var body = document.getElementsByTagName("body")[0];
body.appendChild(button);

button.addEventListener ("click", function() {
  alert("did something");
});

/*
if (sadnessLevel===1)
	console.log("You're too happy for this program... please leave.");
else if (sadnessLevel===9)
	console.log("Please go to healthcenter.gwu.edu for professional help");
else
	console.log("You are", getAdj(), getNoun());*/