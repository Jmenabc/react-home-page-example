import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

class Header extends Component {

    render() {
        return (
            <div class="col d-flex justify-content-center">
                <nav class="navbar navbar-expand-lg m-2 content-align-center align-center">
                    <div class="container-fluid">
                        <a class="navbar-brand text-light" href="#">Navbar</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="navbar-brand text-light" href="#">Ejemplo1</a>
                                </li>
                                <li class="nav-item">
                                    <a class="navbar-brand text-light" href="#">Ejemplo2</a>
                                </li>
                                <li class="nav-item">
                                    <a class="navbar-brand text-light" href="#">Ejemplo3</a>
                                </li>
                                <li class="nav-item">
                                    <a class="navbar-brand text-light" href="#">Ejemplo4</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>

        );
    }
}

export default Header;