import axios from "axios";
import MovieCard from "components/movieCard";
import Pagination from "components/pagination";
import { useState } from "react";
import { MoviePage } from "types/movie";
import { BASE_URL } from "utils/requests";


function Listing() {

    const [pageNumber, setPageNumber] = useState(0);



    axios.get (`${BASE_URL}/v1/movies?size=12&page=0`)
            .then(response => {
                const data = response.data as MoviePage;
                setPageNumber(data.number);
            });

    return (
        <>            
            <Pagination />

            <div className="container">
                <div className="row">
                    <div className="col-sm-6 col-lg-4 col-xl-3">
                        <MovieCard />
                    </div>
                </div>
            </div>
            
        </>
    );
}

export default Listing;