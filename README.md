# Interactive  Website

## Overview

This project is an interactive  website built using React, Tailwind CSS, and GSAP. It focuses on smooth animations, page transitions, and an engaging user experience. The application includes multiple sections such as Home, Agence (About), project(services), and Contact.



## Features

* Animated page transitions using GSAP
* Fullscreen navigation menu with animation
* Multi-page routing using React Router
* Scroll-based animations
* Responsive design using Tailwind CSS
* Smooth and interactive UI



## Technologies Used

* React.js
* Tailwind CSS
* GSAP (GreenSock Animation Platform)
* React Router DOM
* Context API



## Project Structure

```
src/
│── components/
│   ├── common/
│   │   └── Stairs.jsx
│   ├── navigation/
│   │   ├── Navbar.jsx
│   │   └── Fullscreennav.jsx
│
│── pages/
│   ├── Home.jsx
│   ├── Agence.jsx
│   ├── Project.jsx
│   ├── Contact.jsx
│
│── context/
│   └── Navcontext.jsx
│
│── App.jsx
│── main.jsx
```

---

## Application Flow

1. The application opens on the Home page.
2. A stair animation is displayed during page load or navigation.
3. After the animation, the Home page content appears.
4. The user can open the fullscreen navigation menu.
5. The menu opens with animation and displays navigation links.
6. Hovering over links triggers visual animations.
7. Clicking a link navigates to another page (Home, Projects, Agence, Contact).
8. Each page includes animations:

   * Agence (about) page: scroll-based image transitions
   * Projects(service) page: animations while scrolling
   * Contact page: displays contact information
9. The navigation menu can be closed using a close button.





