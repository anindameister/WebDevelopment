# class

- link http://www.clelia.fr/Telecom/

# traversy

#### the necessities

- video link https://www.youtube.com/watch?v=0pThnRneDjw

![The Necessities](https://github.com/anindameister/WebDevelopment/blob/master/snaps/1.PNG)

- server(media and web)
- advantage of using linux as dev machine is that it would match with your producton environment becaus emost production server runs linux
- firefox has great dev tools, even has got stuffs that chrome doesn'that
- terminal: maybe work with cli, ssh later
- designing the UI, adobe XD by Traversy as it's easy and targeted

#### the building blocks

- html and css for the browser to render
- html5, stick to it- allows you to create semantic layout, header-footer-article tages etc
- css is a lot harder than html , css grid and flexbox are the best editions: -bootstrap not required


![the building blocks](https://github.com/anindameister/WebDevelopment/blob/master/snaps/2.PNG)

#### responsive designing

![responsive designing](https://github.com/anindameister/WebDevelopment/blob/master/snaps/3.PNG)

- media queries : stacked one column layout for smart phones
- rem units over px : more adaptible

#### custom reusable css components


![custom reusable css components](https://github.com/anindameister/WebDevelopment/blob/master/snaps/4.PNG)

- saas allows you to do more efficiently. dry principle(dont repeat yourself)

#### css framework

- bootstrap: most popular
- tailwaind css : growing popular, it's highly customisable

![css framework](https://github.com/anindameister/WebDevelopment/blob/master/snaps/5.PNG)

#### vanilla js

![vanilla js](https://github.com/anindameister/WebDevelopment/blob/master/snaps/6.PNG)

- react/nodeJS for the backend
- programming language of the browser
- dynamic page functionality can be done through JS and not python
- dom(document object model): every element of your page is dom and you can manipulate certain things with JS using events and element selectors
- json: fetching data from api and it's similar to js objects
- to make requests to api, you can use FETCH API which is built into the browser and can be used. axioms by traversy.
- arrow functions, template literals, promises, classes added over an update(ES6)
- vanilla js needs to be mastered before moving to any of JS framework

#### tools2

![tools2](https://github.com/anindameister/WebDevelopment/blob/master/snaps/7.PNG)

- create new branch when you're creating a new feature
- dev tools: tabs: element: shows html and css and computed css and it can be edited. it's good for creating templates etc
- dev tools: console tab: debugging, logging, JS error go there. network tab:request, response, any data or file you get back and also show you how it's all performing
- dev tools: application tab: local storage and cookies
- vscode extension: live server, live saas compiler, bracket colouriser. for react and vue, you got extension for error highlighting and intelligent stuffs
- emmet: built into vs code. It's used to get the html written. atom and sublime text needs separate installation of the same. 
- npm or yarm(package manager of js) composer is for php, pip for python
- axios: http library, similar to fetch api.
- webpack or parcel(js module bundlers): install npm packages on the frontend, creating own module which means bringing in js file into another js file: - this can't be done as default with the browser, webpack or parcel would be required to bundle it for you
- for vue js or react, it's done under the hood and so you'd not have to use webpack etc

#### basic deployment

![basic deployment](https://github.com/anindameister/WebDevelopment/blob/master/snaps/8.PNG)

- at this point you should know html, css and some js, some tooling like git and the browser dev tools
- so basically need to know how to deploy and get your website onto the internet
- at the basic we're making landing pages or webapps and at this point we dont need to learn devops  and aws:- such complicated platforms
- for hosting a small site or webapp, a manged hosting company like inmotion or hostgator offers cheap deals
- from the above company, we get our email setup, get cPanel which is a piece of software to manage to manage hosting account and allows you to do everything easilu wihin the browser. no terminal or anything would be needed
- ftp or securedFTP: it's a way to get your files onto your web host. it's very slow. we dont wanna use fftp for large apps but fine for small websites
- another option is static hosting with netflify. we can get a ton for free and it's really easy too use. you can push your code from github or gitlab and you can have continuous deployment. they also have a custom cli that you can use and you also get a free ssl certificate. there's a form submission without having to create maybe a php script
- namecheap to register a domain
- connecting a domain to your webhost is easy
- you can check the docs within the registrar or the hosting accounts
- ssh woud be used for advanced apps and cloud hosting

https://www.hostingadvice.com/how-to/best-static-web-hosting/

![netlify](https://github.com/anindameister/WebDevelopment/blob/master/snaps/9.PNG)

#### basic front end developer

![basic front end developer](https://github.com/anindameister/WebDevelopment/blob/master/snaps/10.PNG)

- add dynamic page functionality with javascript

#### front-end framework

- render template on the server with js framework it's fine Eg: djano with python

![front-end framework](https://github.com/anindameister/WebDevelopment/blob/master/snaps/11.PNG)

#### advanced JS framework frontend

![advanced JS framework frontend](https://github.com/anindameister/WebDevelopment/blob/master/snaps/12.PNG)

- frameworks give us a lot of advantages like re-usable components, a more organised UI
- more of page interaction
- it's better for collaboration and writing clean code
- angular is a full framework where technically react is a library
- The technical difference between a framework and library lies in a term called inversion of control. When you use a library, you are in charge of the flow of the application. You are choosing when and where to call the library. 
- When you use a framework, the framework is in charge of the flow.

#### svelte

![svelte](https://github.com/anindameister/WebDevelopment/blob/master/snaps/13.PNG)

- it is not a framwork but a js compiler. It works differntly than a compiler
- when you run svelte code through your compiler, it produces pure JS, readble
- when you're using a framework, it's has got to do a lot with that specific framework and it's much more bloated than svelte
- svelte produces readable JS which is much lighter and it's very performant and there's no virtual Dom or anything like that
- needn't learn svelte. framwork should be learnt first and then svelte

#### state management

![state management](https://github.com/anindameister/WebDevelopment/blob/master/snaps/14.PNG)

- while building a frontend app or userInterface, a lot of times we have a component  that needs state
- it could be a list of users or maybe you have a modal componenet which in turn has an open and closed state
- at times, you need app level state so that you can share data across multiple components and each frameworks have got different ways of doing it
- we have libraries that are specifically built for this. Eg: React often uses redux. although redux can be also used with something else as well. There's a library called ReactRedux which uses both of them together
- now redux is a 3rd party library. The underlined once are own library which almost creates the same effects as the 3rd party library

#### server side rendering

![server side rendering](https://github.com/anindameister/WebDevelopment/blob/master/snaps/15.PNG)


















