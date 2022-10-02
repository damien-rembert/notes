# Binary search


The array or list searched must be sorted
The search begins in the middle of the array or list
If the value in the middle-point being examined isn't the searched value, eliminate half of the searched area, and move on to examine the middle-point of the remaining half.
If the value in the middle-point being examined is the searched value, return the index of the middle-point being examined.
If there is nowhere left to search (the entire area has been eliminated), return the value -1, indicating that the searched value was not found (i.e, it wasn't in the list or array searched).





// assuming the variable searched exists
// assuming the variable list exists
begin = 0 // the 0th index of the list (i.e, the first index of the list)
end = size(list) - 1 // the last index in the list

repeat until begin is larger than end:
    middle = (end + begin) / 2

    if the value at list[middle] is searched
        return the value of the variable middle

    if the value at list[middle] is smaller than searched
        begin = middle + 1

    if the value at list[middle] is larger than searched
        end = middle - 1

return value -1
