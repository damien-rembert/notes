# Vi

# Normal mode
u	undo last change
U	undo all changes on that line
ctrl+r	redo
x	remove? cut?
d	delete, can be followed by motion
dd	delete whole line
i	insert
a	append
p	put (paste something that's been deleted


## motions
e	end of word
w	whole word, up to next word?
$	end of line
0	start of line

# Motions
w => forward word by word
b => backward word by word

W/B => same as above but function calls sum(2,3) and camel case variables seen as one word

e => forward word by word to the end of each word
ge => backward word by word to the end of each word

f + char => forward to next occurrence of char on the line
F + char => backward to next occurrence of char on the line

t + char => forward to next occurrence of char on the line char not included
T + char => backward to next occurrence of char on the line

## Extremes
0 => move to first char of line

