# Class

# constructor
constructor(param) {...}

# getter
a function that appears externally as a property 
get name() {...}

# Example
class Bunny{
    constructor(name) {
        this._name = name;
        this._hops = 0;
    },
    get name() {
        return this._name;
    }

    get hops() {
        return this._hops;
    }

    get increaseHops() {
        this._hops++;
    }
}

const rosie = new Bunny("Rosie");