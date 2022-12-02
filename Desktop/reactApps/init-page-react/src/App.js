import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header';
import video from "../src/assets/videos/video.mp4";
import "../src/styles/HomePage.css";

function App() {
  return (
    <div className="App">
      <video src={video} autoPlay loop muted />
      <div class="hder">
        <Header></Header>
      </div>

      <div class="in-front-gif">
        <h1 class="mbr-fonts-style mb-3 mbr-section-title display-1">
          <strong>
            I’m Product
            <br />
            Designer
          </strong>
        </h1>
      </div>

    </div>
  );
}

export default App;
