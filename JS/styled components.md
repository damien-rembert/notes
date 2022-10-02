# styled components

```zsh
npm i styled-components
```

```js
import styled from "styled-components";

// at the bottom
// this creates a form component styled as describe that I can call using FormContainer
const FormContainer = styled.form`
    width: 80vw;
    border: solid 2px black;
`;

// to style an imported component 
const Page = styled(BrowserRouter)`
    width = 100vw;
`;
```