class MyElement extends HTMLElement {
constructor() {

super();

 }

connectedCallback() {

 this.innerHTML = "Hello World!";

 this.innerHTML += "I'm " + this.getAttribute("name");

this.innerHTML += `<h2>Selam arkadaşlar</h2>`;

}

}

customElements.define("my-element", MyElement);





