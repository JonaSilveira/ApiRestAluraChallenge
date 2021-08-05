package com.videos.playlist.repository;

import com.videos.playlist.models.Video;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VideoRepository implements PanacheRepository<Video> {
}
