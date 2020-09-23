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
- apollo client is used for graphQl
- smaller app doesnt even need anything, everything can be put in root app component

#### server side rendering

![server side rendering](https://github.com/anindameister/WebDevelopment/blob/master/snaps/15.PNG)

- service side rendering as opposed to the sungle page webapp that's rendered on the client side that's by default when you use something like cretae react app it generates an app that runs  on the clinet
- however there are frameworks like next which is react and nuxt which is vue that allows you to run react or vue on server
- it seems like framework over framework but it's easier in the long run because it brings you close to production that using something like create react app where you just built the static asset so on
- it uses filesystem routing which is the best feature of this
- if you're using a regular single page application react, you need to use to react router and create routes and that can get kind of difficult 
- with next or nuxt, you can create like js page and put it in pages folder and it would render automatically when you to go to your app/about
- seo: if you build a standard react app, it's hard for search engine crawlers to see the data because it's getting rendered through JS after the page load
- with serverside rendering, the content is already there as if it were just a regular html file on the server
- static exporting-- generating static sites, css in your js; whole bunch of features from nuxt or next

#### static site generators

![static site generators](https://github.com/anindameister/WebDevelopment/blob/master/snaps/16.PNG)

- gatsby most popular
- generates static web pages
- implementn data fetching
- gatsby comes bundled with graphQl
- unlike single page apps which we'd create with create react app, with those you make api request as you run the app
- with gatsby, it does all the data fetching from local files during build time
- and it's very performant
- gatsby sites are incredibly fast
- gatsby has some in common with next js like they provide boilerplate application, they're both performant, they have good seo
- however, next js needs a server to run because it renders on a server whereas gatsby is merely a tool that would generate static HTMl on build time. so it doesn't need a server to function at all much like opening up a regular html file on your computer
- you can use different plugins, create blogs and directories, type content using markdown
- however you're not limited to a markdown file but you can use something like headless cms

#### typeScript

- beneficial in larger projects

![typeScript](https://github.com/anindameister/WebDevelopment/blob/master/snaps/17.PNG)

#### front-end wizard

![front-end wizard](https://github.com/anindameister/WebDevelopment/blob/master/snaps/18.PNG)

#### server-side language

![server-side language](https://github.com/anindameister/WebDevelopment/blob/master/snaps/19.PNG)

- node.js is a server-side runtime, allows you to use JS as a server side language
- fast, synchronous, single-threaded, useful for web-app provided thats the web-app is not cpu intensive which generally webapps are not cpu intensive
- mongoDB is javaScript like
- php is very practical
- c#, hard to write sphagetti code
- GoLang- created by Google, easier than c and c++
- Spring is liked by people, the Framwork
- Rust can be used with webAssembly with c and C++

#### server-side framwork

![server-side framwork](https://github.com/anindameister/WebDevelopment/blob/master/snaps/20.PNG)

- nest.js is very similar to angular. if you choose angular in front end then maybe go for nest.js as backend

- django is very high level, authentication 
- Ruby on Rails, fastest to create things

#### database

![database](https://github.com/anindameister/WebDevelopment/blob/master/snaps/21.PNG)

- relation db- like spreadsheet.
- postgres: easy to work with fast and object relational db
- mongoDB stores as docs. 
- cloud database- firebase: smaller to medium sized app.. gives authentication etc
- SQL for relational

#### graphQl

![graphQl](https://github.com/anindameister/WebDevelopment/blob/master/snaps/22.PNG)

#### content mgmt system

![content mgmt system](https://github.com/anindameister/WebDevelopment/blob/master/snaps/23.PNG)

#### deployment & devops

![deployment & devops](https://github.com/anindameister/WebDevelopment/blob/master/snaps/24.PNG)

- heroko: push from git
- docker: local zamp server instead of docker

#### full stack developer

![full stack developer](https://github.com/anindameister/WebDevelopment/blob/master/snaps/25.PNG)

#### mobile development

![mobile development](https://github.com/anindameister/WebDevelopment/blob/master/snaps/26.PNG)

- JS and java= flutter

#### Progressive Web Apps

![Progressive Web Apps](https://github.com/anindameister/WebDevelopment/blob/master/snaps/27.PNG)

#### desktop apps with electron

![desktop apps with electron](https://github.com/anindameister/WebDevelopment/blob/master/snaps/28.PNG)

#### JAMstack

![JAMstack](https://github.com/anindameister/WebDevelopment/blob/master/snaps/29.PNG)

#### Serverless Architecture

![Serverless Architecture](https://github.com/anindameister/WebDevelopment/blob/master/snaps/30.PNG)

- runs the server when it needs it to, and not always

#### api-first designing

![api-first designing](https://github.com/anindameister/WebDevelopment/blob/master/snaps/31.PNG)

#### ai and machine learning

![ai and machine learning](https://github.com/anindameister/WebDevelopment/blob/master/snaps/32.PNG)

#### speech recognition

![speech recognition](https://github.com/anindameister/WebDevelopment/blob/master/snaps/33.PNG)

#### web assembly

![web assembly](https://github.com/anindameister/WebDevelopment/blob/master/snaps/34.PNG)






































