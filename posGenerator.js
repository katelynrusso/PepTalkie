function getAdj ()
{
	var adjectives = ['a kindred', 'a beautiful', 'a dazzling', 'an elegant', 'a fancy', 'a glamorous', 'a gorgeous', 
		'a handsome', 'a magnificent', 'a muscular', 'a lionhearted', 'a delightful', 'a wonderful', 'an amazing', 'a stupendous', 
		'a powerful', 'an ambitious', 'a faithful', 'a happy', 'a victorious', 'a zealous', 'a zesty', 'a lively', 'a witty', 
		'a spectacular', 'a melodic', 'a modern', 'a delicious', 'a sweet', 'a cuddly', 'a smart', 'a sassy', 'a strong', 
		'a limitless', 'an important', 'an impressive'];
	var randomNumber = Math.floor(Math.random()*(adjectives.length-1));
	return adjectives[randomNumber];
}

function getNoun ()
{
	var nouns = ['ace-in-the-hole', 'benefactor', 'catalyst', 'champion', 'connoisseur', 'devotee', 'dreamboat', 'enchantress', 
		'angel', 'artisan', 'beauty', 'brain', 'dude', 'comrade', 'genius', 'dear', 'doe', 'delight', 'doll', 'dawg', 'princess', 
		'fashionista', 'garden', 'gem', 'tamale', 'goddess', 'guardian', 'helper', 'hero', 'hotshot', 'go-getter', 'jester', 
		'spirit', 'kingpin', 'cupcake', 'legend', "lady's man", 'lionheart', 'masterpiece', 'tapestry', 'being', 'animal'];
	var randomNumber = Math.floor(Math.random()*(nouns.length-1));
	return nouns[randomNumber];
}

/*
if (sadnessLevel===1)
	console.log("You're too happy for this program... please leave.");
else if (sadnessLevel===9)
	console.log("Please go to healthcenter.gwu.edu for professional help");
else
	console.log("You are", getAdj(), getNoun());*/