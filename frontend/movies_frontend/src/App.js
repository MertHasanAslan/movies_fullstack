import './App.css';
import api from "./api/axiosConfig";
import {useState, useEffect} from "react";
import Layout from './components/Layout';
import {Routes, Route} from "react-router-dom";
import Home from "./components/home/Home";



function App() {

    const [movies, setMovies] = useState();
    
    const getMovies = async () =>{

        try{
            const response = await api.get("/api/v1/movies/get_all");

            setMovies(response.data);

        }
        catch(err){
            console.log(err);
        }

    }

    useEffect(() => {
        if (movies){
            console.log(movies)
        }
    }, [movies]);
  

    useEffect(() => {
        getMovies();
    }, [])

    return (
        <div className="App">

            <Routes>
                <Route path="/" element={<Layout/>}>
                    <Route index element={<Home />} />
                </Route>
            </Routes>

        </div>
    );
}


export default App;
