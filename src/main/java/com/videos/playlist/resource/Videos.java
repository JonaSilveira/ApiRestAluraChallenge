package com.videos.playlist.resource;

import com.videos.playlist.models.Video;
import com.videos.playlist.repository.VideoRepository;
import io.quarkus.panache.common.Sort;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/videos")
public class Videos {

    @Inject
    VideoRepository videoRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Video> listAll(){
        return videoRepository.listAll(Sort.ascending("nome"));
    }


}
