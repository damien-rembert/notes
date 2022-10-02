# Regular Expressions 

Regular Expressions/RegExes are patterns used to search (and capture) matches in text.


# Literal characters
Most characters can be used somewhat literaly except for:

# Special characters/metacharacters

symbol & name                    | meaning
---------------------------------|------------------
backslash `\`                    | makes special characters "normal" and normal char special
caret `^`                        | negates a class OR anchors at the start
dollar sign `$`                  | anchors at the end of line
dot `.`                          | any character except line breaks
pipe symbol `|`                  | OR
question mark `?`                | zero or one of the previous character or group
star `*`                         | zero or more of the previous
plus sign `+`                    | one or more of the previous
parenthesis `()`                 | grouping and capturing
square brackets `[]`             | defining a class
curly braces `{}`                | `{n}` repeating n times, `{x,y}` repeating at min x times, max y times, also `{,y}` and `{x,}` where undefined value = unlimited


# The mighty dot
`.` any character except line breaks

`.` => lorem lkfjdslfjk lkfsjf ldskfjle mdfj§:f!:;!:;lkfm 


# Backslash and other characters
backslash `\` is the escape character, to make special characters "normal" and used in combination with non special characters to make them special.


## Non-printable characters
`\t` is Tab
`\r\n` is carriage Return and New line (line break is just `\n` on Linux/Mac)


## Ready-made classes
`\w` matches all Word characters (letters, numbers and underscore)
`\d` matches all numbers
`\s` matches all white characters (tab, spaces, line breaks)


## Anchors/Positioning
`\b` at the Border between a Word character `\w` and non word character.

`^` anchors at the start
`$` anchors at the end of line


# Classes
square bracket `[]`
caret `^`     used to negate a class OR mark 
minus `-`

`[abc]` => Wow, batman is amazing! 


# Grouping and Capturing
parenthesis `()`
pipe symbol `|`       means OR



# Repetitions/
question mark ? => 0 or 1 occurrences
star *
plus sign +
curly brace {}
`{n}` repeating n times, `{x,y}` repeating at min x times, max y times, also `{,y}` and `{x,}` where undefined value = unlimited

`[abc]` => batman babatman
`[abc]+` => batman babatman
`(ba)+` => batman babatman



# Examples

## quick and dirty email address check
`.+@.+\.[a-z]+`

test@gmail.com


## find all tags in code 
`<(a|p|img)`

```html
    <div id="lower_content">
        <div id="weekly_recommends">
            <p>Recommended this week on GBC</p>
            <!-- add anchors -->
            <p><a>Give her biscuits</a></p>
            <p><a>Signature dish</a></p>
            <p><a>Shades of January</a></p>
            <img src="https://media-cdn.greatbritishchefs.com/media/xrga0epj/img29188.jpg?mode=crop&width=520&height=347" alt="More Biscuits">
        </div>
    </div>
```

## quickly formatting text

`,( and)? the ` => `\n` (or `\r\n` on Windows)
`$` =>  ` | `
`(.) \| $` => ``$1` | `

backslash \, the caret ^, the dollar sign $, the period or dot ., the vertical bar or pipe symbol |, the question mark ?, the asterisk or star *, the plus sign +, the opening parenthesis (, the closing parenthesis ), the opening square bracket [, and the opening curly brace {


# Resources

Well-explained ressources that goes into details when needed:
https://www.regular-expressions.info

Lots of ready-made regular expressions:
https://regexlib.com

Interesting blog post on validating email addresses (and the standard used for email addresses):
http://haacked.com/archive/2007/08/21/i-knew-how-to-validate-an-email-address-until-i.aspx/
