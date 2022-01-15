import './styles.css';

import MovieStars from 'components/movieStars';

function MovieScore() {

    const score = 2.5;
    const count = 13;

    return (
        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="dsmovie-score-count">{count} avaliações</p>
        </div>
    );
}

export default MovieScore