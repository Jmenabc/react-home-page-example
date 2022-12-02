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

    </div>
  );
}

export default App;
