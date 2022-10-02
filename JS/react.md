# React

# components
names should begin with a capital letter

# controled component form in react
look into

# props

```js
ReactDOM.render(<App />, mountNode);
```

# hooks
## useState
## useEffect
triggered on rendering (and re-renderings)
useEffect run just once if the array is empty OR everytime the values in the array change

# jsx
syntax mixing JS and html

# Requirements for React.js
 our project to create a react
app:
NPM
Webpack
A compiler like Babel
React & React-Dom
A development server to use locally

# Passing 
We can pass a function to another component with props, if we want to pass a value to that function in an event (onClick), using anonymous function
```jsx
    return (
        <div >
            <h1>Hello, Common here</h1>
            {numbers.map((number, index) => {
                // here we pass the index to that function using anonymous function
                return <h1 onClick={() => removeHandler(index)}key={index}>{number}</h1>
            })}
            <button onClick={addHandler}>add number</button>
        </div>
    );
```

# React.Fragment
<> or <React.Fragment>
to be used when you do not want to add a div to the dom
downside cannot use attributes

# testing

install:
```bash
npm install --save @testing-library/react @testing-library/jest-dom
```

If you want to avoid boilerplate in your test files, you can create a src/setupTests.js file:
```JS
// react-testing-library renders your components to document.body,
// this adds jest-dom's custom assertions
import '@testing-library/jest-dom';
```

Example to test App.js:
in src/App.test.js
```JS
import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

it('renders without crashing', () => {
  const div = document.createElement('div');
  ReactDOM.render(<App />, div);
});
```

# React Lifecycle

## Rendering: 
The render method is a required method within a class component in React. This method controls the rendering of your component to the UI.
## Mounting: 
This method gets called right after the component is added into the DOM, through the render method. This method is called only one time in a lifecycle. This rendering will happen before the browser can update the UI and ensure that the user doesn’t see any UI updates with this double rendering.
## Re-rendering: 
This lifecycle method is called at the exact moment that the updating happens. Usually, this lifecycle method is used for updating the DOM in response to some state or prop changes.
## Unmounting: 
This lifecycle method is used just before that particular component is destroyed and unmounted. This is the right spot to do any clean-up actions in your component. In this lifecycle method, we can perform activities such as cancelling API calls, as well as clearing caches or timers.



# questions
    what is "state"?
    ups and downs of class and functional components
    what are component re-renderings and how do they work?
    how to trigger re-renderings
    different component lifecycles and how to interact with them
    Virtual DOM
    Benefits of CSR (Client Side Rendering) and SSR (Server Side Rendering) in general and in React
    Controlled vs. Uncontrolled Components
    State Lifting
    at least one global state management technology (Context API, Redux/Toolkit, Recoil)
    Component Patterns (especially how to choose the right pattern)


# React Router
React is a single page application
```zsh
npm i react-router-dom
```
in App.js import
```js
import { BrowserRouter, Routes, Route } from react-router-dom;
// ...
// then return
return(
    <BrowserRouter>
        <Routes>
            {!user ? <Navigate to="/" /> : <Navigate to="/home" /> }
            <Route pass="/" element={<Login setuser={setUser} />} />
            <Route pass="/home" element={<Home />} />
        </Routes>
    </BrowserRouter>
)
```
<Route /> acts as a redirect
<Link to="/">Home</Link> acts as a link like <a>