<!--
*** Thanks for checking out the AST CLI Maven Plugin. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="">
    <img src="logo.png" alt="Logo" width="80" height="80">
  </a>


<h3 align="center">AST CLI Maven Plugin</h3>
  <p align="center">
    The AST CLI Maven Plugin allows you to use the AST CLI inside Maven.
    <br />
    <a href=""><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/CheckmarxDev/ast-cli-maven-plugin/issues/new">Report Bug</a>
    ·
    <a href="https://github.com/CheckmarxDev/ast-cli-maven-plugin/issues/new">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

The AST CLI Maven Plugin allows you to use the AST CLI inside Maven.


<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

- Maven
- Access to a CxAST account (oauth2 client or an API Key)


### Installation

1. Clone the repo
   ```sh
   https://github.com/CheckmarxDev/ast-cli-maven-plugin
   ```
2. Install the Maven package
   ```sh
   mvn install
   ```


<!-- USAGE EXAMPLES -->
## Usage
[Configure your credentials](https://checkmarx.atlassian.net/wiki/spaces/AST/pages/6025543721/Authentication+for+CxAST+CLI+and+Plugins) and run the following goal:
   ```sh
   com.checkmarx:ast-cli-maven-plugin:0.0.1:run "-Darguments=..." -f pom.xml
   ```
Check [this page](https://checkmarx.atlassian.net/wiki/spaces/AST/pages/3039953091/CLI+Commands) for possible arguments.

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Checkmarx - AST Integrations Team

Project Link: [https://github.com/CheckmarxDev/ast-cli-maven-plugin](https://github.com/CheckmarxDev/ast-cli-maven-plugin)


© 2021 Checkmarx Ltd. All Rights Reserved.

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/CheckmarxDev/ast-cli-maven-plugin.svg?style=flat-square
[contributors-url]: https://github.com/CheckmarxDev/ast-cli-maven-plugin/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/CheckmarxDev/ast-cli-maven-plugin.svg?style=flat-square
[forks-url]: https://github.com/CheckmarxDev/ast-cli-maven-plugin/network/members
[stars-shield]: https://img.shields.io/github/stars/CheckmarxDev/ast-cli-maven-plugin.svg?style=flat-square
[stars-url]: https://github.com/CheckmarxDev/ast-cli-maven-plugin/stargazers
[issues-shield]: https://img.shields.io/github/issues/CheckmarxDev/ast-cli-maven-plugin.svg?style=flat-square
[issues-url]: https://github.com/CheckmarxDev/ast-cli-maven-plugin/issues
[license-shield]: https://img.shields.io/github/license/CheckmarxDev/ast-cli-maven-plugin.svg?style=flat-square
[license-url]: https://github.com/CheckmarxDev/ast-cli-maven-plugin/blob/master/LICENSE
[product-screenshot]: images/screenshot.png