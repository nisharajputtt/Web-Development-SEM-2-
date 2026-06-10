function Student({block}){

    return(
        <div className="bg-amber-200 shadow-2xl mt-4 flex justify-center items-center h-30 rounded-2xl flex-col gap-2">
            <div className="text-2xl">{block.name}</div>
            <div className="text-xl">Course : {block.course}</div>
            <div className="text-xl">Marks : {block.marks}</div>
        </div>
    )
}

export default Student